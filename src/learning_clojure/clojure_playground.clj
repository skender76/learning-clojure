(ns learning-clojure.clojure-playground
  (:import [java.util Date]))



(def addition +)

(defn current-date []
  "Returns the current date"
  (new Date))

(defn <3 [love & loved-ones]
  (for [loved-one loved-ones]
    (str love "love " loved-one)))

(defn sum-something [something & nums]
  (apply addition something nums))

(def sum-one (partial sum-something 1))
