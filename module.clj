(ns foo.bar)

(def printer (fn [msg] (print msg)))

(defn main
  ([] (printer "saludos")))
