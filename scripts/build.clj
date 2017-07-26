(require '[cljs.build.api :as b])

(b/build "src"
         {:optimizations :advanced
          :main 'example.core
          :npm-deps {:left-pad "1.1.3"} ;; NEW
          :output-to "main.js"
          :target :nodejs
          :verbose true})
