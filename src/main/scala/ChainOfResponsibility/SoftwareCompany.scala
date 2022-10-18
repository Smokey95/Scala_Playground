package ChainOfResponsibility

/**
  * Copyright 2017 josephguan
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  *
  */

/**
  * This is the client
  */
class SoftwareCompany {

  val chain: RequestHandler.Type = {
    RequestHandler.developer orElse RequestHandler.architect orElse RequestHandler.CTO orElse RequestHandler.noOne
  }

  def handleRequest(req: Request): Response = {
    val x = chain(req)
    println(x)
    return x
  }
}