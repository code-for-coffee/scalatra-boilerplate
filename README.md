# Scalatra Boilerplate #

## Install Dependencies ##

```sh
brew install scala
brew install giter8
brew install jetty
```

## Build & Run ##

Launch the simple build tool (this can take a while). Then use jetty to start your servlet.

```sh
$ cd Scalatra_Boilerplate
$ ./sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

