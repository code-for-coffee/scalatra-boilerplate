package org.codeforcoffee.boilerplate

import org.scalatra._

class ScalatraApiServlet extends ScalatraBoilerplateStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
