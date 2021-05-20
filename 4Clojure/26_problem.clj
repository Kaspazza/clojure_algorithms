;; Fibonacci Sequence
;; https://www.4clojure.com/problem/26

(defn fibonacci
  ([num]
   (cond
     (= num 1) [1]
     (= num 2) [1 1]
     :else (fibonacci (- num 2) [1 1])))
  ([num sum] (if (= num 0)
               sum
               (recur (dec num) (conj sum (reduce + (take-last 2 sum)))))))

(= (fibonacci 3) '(1 1 2))

(= (fibonacci 6) '(1 1 2 3 5 8))

(= (fibonacci 8) '(1 1 2 3 5 8 13 21))
