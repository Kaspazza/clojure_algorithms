;; Rotate Sequence
;; https://www.4clojure.com/problem/44

(= (#(take (count %2) (drop (mod % (count %2)) (cycle %2))) 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (#(take (count %2) (drop (mod % (count %2)) (cycle %2))) -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (#(take (count %2) (drop (mod % (count %2)) (cycle %2))) 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (#(take (count %2) (drop (mod % (count %2)) (cycle %2))) 1 '(:a :b :c)) '(:b :c :a))

(= (#(take (count %2) (drop (mod % (count %2)) (cycle %2))) -4 '(:a :b :c)) '(:c :a :b))
