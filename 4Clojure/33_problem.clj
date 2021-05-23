;; Replicate a Sequence
;; https://www.4clojure.com/problem/33

(= (#(mapcat (fn [x] (repeat %2 x)) %) [1 2 3] 2) '(1 1 2 2 3 3))

(= (#(mapcat (fn [x] (repeat %2 x)) %) [:a :b] 4) '(:a :a :a :a :b :b :b :b))

(= (#(mapcat (fn [x] (repeat %2 x)) %) [4 5 6] 1) '(4 5 6))

(= (#(mapcat (fn [x] (repeat %2 x)) %) [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

(= (#(mapcat (fn [x] (repeat %2 x)) %) [44 33] 2) [44 44 33 33])
