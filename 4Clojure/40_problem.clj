; Interpose a Seq
;; https://www.4clojure.com/problem/40

(= (#(rest (interleave (repeat %) %2)) 0 [1 2 3]) [1 0 2 0 3])

(= (apply str (#(rest (interleave (repeat %) %2)) ", " ["one" "two" "three"])) "one, two, three")

(= (#(rest (interleave (repeat %) %2)) :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
