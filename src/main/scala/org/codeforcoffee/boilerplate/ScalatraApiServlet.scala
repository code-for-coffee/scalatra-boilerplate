package org.codeforcoffee.boilerplate

import org.scalatra._

class ScalatraApiServlet extends ScalatraBoilerplateStack {

  get("/xml") {
    <html>
      <body>
        <h1>XML Literal</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/string") {
  	"I can return a String literal."
  }

  get("/pages/:slug") {
  	contentType = "text/html"
  	ApiViewModels.models.find (_.slug == params("slug")) match {
  		case Some(model) => ssp("/model", "model" -> model)
  		case None => halt(404, "Not found. :(")
  	}
  }

}

// create accesors for all props in constructor
case class ViewModel(slug:String, header:String, body:String, payload:String)

object ApiViewModels {
	val datasetOne = ViewModel("home", "Meowth", "Best pokemon evar", "Meowth spends money!")
	val datasetTwo = ViewModel("about", "Pokemon fan club", "We accept everyone!", "GO TEAM MYSTIC!!@!@")

	val models = List(datasetOne, datasetTwo)
}