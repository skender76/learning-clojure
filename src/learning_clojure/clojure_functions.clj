(ns learning-clojure.clojure-functions)

(defn make-thingy [x]
  (fn [& args] x))

(defn triplicate [f]
  (apply f [])
  (apply f [])
  (apply f []))

(defn opposite [f]
  (fn [& args]
    ((not (apply f args)))))

;(defn triplicate2 [f & args]
;  (triplicate f))

(Math/cos Math/PI)

(defn pitagora [x]
  (+
    (Math/pow (Math/sin Math/PI) 2)
    (Math/pow (Math/cos Math/PI) 2))
  )

(defn http-get [url]
  (slurp url))

(defn one-less-arg [f x]
  (fn [& args] (f x)))

(defn two-fns [f g]
  (fn [x] (f (g x))))
