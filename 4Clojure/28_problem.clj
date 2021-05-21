;; Flatten a Sequence
;; https://www.4clojure.com/problem/28

(defn make-it-flat [col]
  (filter (complement sequential?) (rest (tree-seq sequential? seq col))))

(= (make-it-flat '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (make-it-flat ["a" ["b"] "c"]) '("a" "b" "c"))

(= (make-it-flat '((((:a))))) '(:a))
