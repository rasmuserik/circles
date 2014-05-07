(defproject circles "0.0.0-SNAPSHOT"
  :description ""
  :url "https://github.com/rasmuserik/circles"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds { 
      :dev {
        :id "dev"
        :source-paths ["src"]
        :compiler {
          :output-to "build/dev.js"
          :output-dir "build/dev"
          :optimizations :none
          :source-map true}
        }
      :dist {
        :id "dist"
        :source-paths ["src"]
        :compiler {
          :output-to "dist.js"
          :output-dir "build/dist"
          :pretty-print false
          :optimizations :advanced }}}})
