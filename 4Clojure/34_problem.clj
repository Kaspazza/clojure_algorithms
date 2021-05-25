;; Implement range
;; https://www.4clojure.com/problem/34

(= (#(take (- %2 %1) (iterate inc %1)) 1 4) '(1 2 3))

(= (#(take (- %2 %1) (iterate inc %1)) -2 2) '(-2 -1 0 1))

(= (#(take (- %2 %1) (iterate inc %1)) 5 8) '(5 6 7))
