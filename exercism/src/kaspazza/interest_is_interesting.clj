(ns kaspazza.interest-is-interesting)

(defn interest-rate
  "TODO: add docstring"
  [balance]
  (cond
    (< balance 0M) -3.213
    (and (>= balance 0M) (< balance 1000M)) 0.5
    (and (>= balance 1000M) (< balance 5000M)) 1.621
    :else 2.475))

(defn annual-balance-update
  "TODO: add docstring"
  [balance]
  (let [ir (bigdec (/ (interest-rate balance) 100))
        ir-balance (* ir (abs balance))
        final-balance (+ ir-balance balance)]
    final-balance))

(defn amount-to-donate
  "TODO: add docstring"
  [balance tax-free-percentage]
   (max (int (Math/floor (* balance (/ tax-free-percentage 100) 2))) 0))

