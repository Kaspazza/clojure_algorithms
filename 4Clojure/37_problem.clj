;; Regular Expressions
;; https://www.4clojure.com/problem/37

(= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
