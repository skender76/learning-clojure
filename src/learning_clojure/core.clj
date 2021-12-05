(ns learning-clojure.core
  (:require [learning-clojure.clojure-playground :refer :all]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main []
  (println (sum-something 1 2 3 4))
  )
