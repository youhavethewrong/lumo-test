(require '[lumo.build.api :as b])

(b/build "src"
         {:optimizations :advanced
          :main 'example.core
          :npm-deps {:left-pad "1.1.3"} ;; NEW
          :output-to "main.js"
          :target :nodejs})


;; (b/build "src"
;;   {:main 'example.core
;;    :output-to "main.js"
;;    :optimizations :advanced
;;    :target :nodejs})
