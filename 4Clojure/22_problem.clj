;; Count a Sequence
;; https://www.4clojure.com/problem/22

(defn count-sequence
  ([col] (count-sequence col 0))
  ([col step] (if-let [r (next col)] (recur r (inc step)) (inc step))))

(= (count-sequence '(1 2 3 3 1)) 5)

(= (reduce (fn [count _] (inc count)) 0 "Hello World") 11)

(= ((comp (partial apply +) (partial map #(do % 1))) [[1 2] [3 4] [5 6]]) 3)

(= (count-sequence '(13)) 1)

(= (count-sequence '(:a :b :c)) 3)
