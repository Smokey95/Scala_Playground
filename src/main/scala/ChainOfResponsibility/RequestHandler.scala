package ChainOfResponsibility

object RequestHandler {
  
  // Handler Interface
  type Type = PartialFunction[Request, Response]

  // Concrete Handler
  val developer: RequestHandler.Type = {
    //println("developer called")
    case req@FixBugRequest(desc) =>
      println(s"I am a developer. I can fix this bug: $desc")
      Response(req, handled = true)
  }

  // Concrete Handler
  val architect: RequestHandler.Type = {
    case req@FeatureRequest(desc) =>
      println(s"I am a architect. I can implement this feature: $desc")
      Response(req, handled = true)
  }

  // Concrete Handler
  val CTO: RequestHandler.Type = {
    case req@ProductRequest(desc) =>
      println(s"I am a CTO. I can make this product: $desc")
      Response(req, handled = true)
  }

  // Concrete Handler
  val noOne: RequestHandler.Type = {
    case req: Request =>
      println("No one is responsible for this request.")
      Response(req, handled = false)
  }


}