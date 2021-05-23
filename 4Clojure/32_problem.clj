;; Duplicate a Sequence
;; https://www.4clojure.com/problem/32

(= (reduce #(conj (conj % %2) %2) [] [1 2 3]) '(1 1 2 2 3 3))

(= (reduce #(conj (conj % %2) %2) [] [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= (#(interleave % %) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= (#(interleave % %) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
