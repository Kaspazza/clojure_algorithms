;; Interleave two Seqs
;; https://www.4clojure.com/problem/39

(= (#(apply concat (map vector % %2)) [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= (mapcat list [1 2] [3 4 5 6]) '(1 3 2 4))

(= (mapcat list [1 2 3 4] [5]) [1 5])

(= (mapcat list [30 20] [25 15]) [30 25 20 15])
