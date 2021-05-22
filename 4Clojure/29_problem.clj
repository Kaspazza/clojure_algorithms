;; Get the Caps
;; https://www.4clojure.com/problem/29

(defn capital [s] (apply str (filter #(Character/isUpperCase %) s)))

(= (capital "HeLlO, WoRlD!") "HLOWRD")

(empty? (capital "nothing"))

(= (#(apply str (re-seq #"[A-Z]" %)) "$#A(*&987Zf") "AZ")
