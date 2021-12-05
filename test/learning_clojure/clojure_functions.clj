(ns learning-clojure.clojure-functions
  (:require [clojure.test :refer :all]
            [clojure-functions :refer :all]))


(let [n (rand-int Integer/MAX_VALUE)
      f (make-thingy n)]
  (assert (= n (f)))
  (assert (= n (f 123)))
  (assert (= n (apply f 123 (range)))))

(defn inc [x] )

(assert (= -1.0 (Math/cos Math/PI)))

(assert (= 1.0 (pitagora Math/PI)))

(assert (.contains (http-get "https://www.w3.org") "html"))
