package ChainOfResponsibility

/**
  * App is the client
  */
object App extends App {
  val company = new SoftwareCompany()

  company.handleRequest(FixBugRequest("bug"))
  company.handleRequest(FeatureRequest("feature"))
  company.handleRequest(ProductRequest("product"))
  company.handleRequest(FakeRequest("fake"))
}