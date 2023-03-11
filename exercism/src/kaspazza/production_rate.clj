(ns kaspazza.production-rate)

(def cars-per-hour 221)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (case speed
    0 0
    (1 2 3 4) speed
    (5 6 7 8) (* (* speed cars-per-hour) 0.9)
    9 80 (* (* speed cars-per-hour) 0.8)
    10 77 (* (* speed cars-per-hour) 0.77)
    nil))