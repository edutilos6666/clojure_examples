(ns clojure-examples.ArithmeticOps)
(gen-class
  :name clojure-examples.ArithmeticOps
  :methods [
            [add [Double, Double] Double],
            [sub [Double, Double] Double],
            [mul [Double , Double] Double],
            [div [Double, Double] Double]
            ]
  )


(defn -add [this, x, y]
  (+ x y)
  )

(defn -sub [this, x, y]
  (- x y)
  )


(defn -mul [this, x, y]
  (* x y)
  )

(defn -div [this, x, y]
  (double (/ x y))
  )

