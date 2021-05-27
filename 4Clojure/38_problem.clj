;; Maximum value
;; https://www.4clojure.com/problem/38

(defn new-max [& args] (reduce #(if (> %1 %2) %1 %2) args))

(= (new-max 1 8 3 4) 8)

(= (#(last (sort %&)) 30 20) 30)

(= (new-max 45 67 11) 67)
