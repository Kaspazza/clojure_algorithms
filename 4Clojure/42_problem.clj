;; Factorial Fun
;;https://www.4clojure.com/problem/42

(= (#(reduce * (range 1 (inc %))) 1) 1)

(= (#(reduce * (range 1 (inc %))) 3) 6)

(= (#(reduce * (range 1 (inc %))) 5) 120)

(= (#(reduce * (range 1 (inc %))) 8) 40320)
