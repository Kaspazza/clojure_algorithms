;; Reverse a Sequence
;; https://www.4clojure.com/problem/23

(defn reverse-seq
  ([col] (reverse-seq col '()))
  ([col sec-col] (if-let [r (next col)] (recur r (conj sec-col (first col))) (conj sec-col (first col)))))

(= (reverse-seq [1 2 3 4 5]) [5 4 3 2 1])

(= (reduce conj '() (sorted-set 5 7 2 7)) '(7 5 2))

(= ((partial into '()) [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

(= (apply conj '() [1 3 5 7 10 2]) [2 10 7 5 3 1])
