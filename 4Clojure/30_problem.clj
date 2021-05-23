;; Compress a Sequence
;; https://www.4clojure.com/problem/30


(defn remove-consecutive-duplicates [col]
  (reduce #(if (= (last %) %2) % (conj % %2)) [] col))

(= (apply str (remove-consecutive-duplicates "Leeeeeerrroyyy")) "Leroy")

(= (#(map first (partition-by identity %)) [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (remove-consecutive-duplicates [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
