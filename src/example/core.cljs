(ns example.core
  (:require left-pad))


(enable-console-print!)

;; pad the number 42 with five zeros
(println "Hello, world!")
(println (left-pad 42 5 0))
