;; Sum It All Up
;; https://www.4clojure.com/problem/24

(= (reduce + [1 2 3]) 6)

(= (reduce + (list 0 -2 5 5)) 8)

(= (reduce + #{4 2 1}) 7)

(= (reduce + '(0 0 -1)) -1)

(= (reduce + '(1 10 3)) 14)
