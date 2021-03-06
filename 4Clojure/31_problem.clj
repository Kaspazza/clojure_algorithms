;; Pack a Sequence
;; https://www.4clojure.com/problem/31

(= (partition-by identity [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))

(= (partition-by identity [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))

(= (partition-by identity [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
