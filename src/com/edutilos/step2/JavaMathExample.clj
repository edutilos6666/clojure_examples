(ns com.edutilos.step2.JavaMathExample)

(defn JavaMathExample_example1 []
  (def math_x 3.1)
  ;(let [math_x 3.1])
  (def angle  (/ (Math/PI) 3))
  
      (def round (Math/round math_x))
      (def floor (Math/floor math_x))
      (def ceil (Math/ceil math_x))
      (def abs (Math/abs math_x))
      (def sin (Math/sin angle))
      (def cos (Math/cos angle))
      (def tan (Math/tan angle))
      (def asin (Math/asin sin))
      (def acos (Math/acos cos))
      (def atan (Math/atan tan))
      (println "<<java.Math examples>>")
      (println (str "round = " round))
      (println (str "floor = " floor))
      (println (str "ceil = " ceil))
      (println (str "abs = " abs))
      (println (str "sin = " sin))
      (println (str "cos = " cos))
      (println (str "tan = " tan))
      (println (str "asin = " asin))
      (println (str "acos = " acos))
      (println (str "atan = " atan))
      )

    

  
