;; Hello World
;; https://www.4clojure.com/problem/16

(= (#(str "Hello, " % "!") "Dave") "Hello, Dave!")

(= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!")

(= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!")
