(ns com.edutilos.step2.OperatorsExample)
(defn ArithmeticOperators []

      (defn add [x,y]
        (+ x y)
        )

      (defn sub [x, y]
        (- x y)
        )

      (defn mul [x, y]
        (* x y)
        )

      (defn div [x, y]
        double (/ x y)
        )


      (def x 10.0)
      (def y 3.0)
      (println "<<Arithmetic Operators>>")
      (def add_res (add x y))
      (def sub_res (sub x y))
      (def mul_res (mul x y))
      (def div_res (div x y))
      (println (str "x + y = " add_res))
      (println (str "x -y = " sub_res))
      (println (str "x * y = " mul_res))
      (println (str "x / y = " div_res))

      )





(defn ComparisonOperators []
  (defn eq [x, y]
    (== x y)
    )

  (defn ne [x,y ]
    (not= x y)
    )

  (defn gt [x, y]
    (> x y)
    )

  (defn ge [x, y]
    (>= x y)
    )

  (defn lt [x, y]
    (< x y)
    )

  (defn le [x, y]
    (<= x y)
    )


  (def x 10.0)
  (def y 3.0)
  ;(let [x 10.0 y 3.0])
      (def res_eq (eq x y))
      (def res_ne (ne x y))
      (def res_gt (gt x y))
      (def res_ge (ge x y))
      (def res_lt (lt x y))
      (def res_le (le x y))

      (println "<<Comparison Operators>>")
      (println (str "x == y  = " res_eq))
      (println (str "x not= y = " res_ne))
      (println (str "x > y = " res_gt))
      (println (str "x >= y = " res_ge))
      (println (str "x < y = " res_lt))
      (println (str "x <= y = " res_le))
      )




(defn LogicalOperators  []
  (def x true)
  (def y false)
  ;(let [x true y false])

      (def res_and (and x y))
      (def res_or (or x y))
      (def res_not_x (not x))
      (def res_not_y (not y))
      (println "<<Logical Operators>>")
      (println (str "x and y = " res_and))
      (println (str "x or y = " res_or))
      (println (str "not x = " res_not_x))
      (println (str "not y = " res_not_y))
      )


(defn BitwiseOperators []
  (def x 10)
  (def y 23)
  ;(let [x 10 y 23])

      (def res_bit_and (bit-and x y))
      (def res_bit_or (bit-or x y))
      (def res_bit_xor (bit-xor x y))
      (def res_bit_not_x (bit-not x))
      (def res_bit_not_y (bit-not y))
      (println "<<Bitwise Operators>>")
      (println (str "x & y = " res_bit_and))
      (println (str "x | y = " res_bit_or))
      (println (str "x ^ y = " res_bit_xor))
      (println (str "!x = " res_bit_not_x))
      (println (str "!y = " res_bit_not_y))
      )
