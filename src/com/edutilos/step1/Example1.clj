(ns com.edutilos.main.Example1
  (:import (javax.swing JOptionPane)))
(defn hello-world []
  (println "Hello World!"))


(defn add [a, b]
  (+ a b))


(defn sub [a, b]
  (- a b))

(defn mul [a,b]
  (* a b))


(defn div [a,b]
  (float (/ a b)))

(println (add 10 3))
(println (sub 10 3))
(println (mul 10 3))
(println (div 10 3))



(def res_add (+ 10 3))
(def res_sub (- 10 3))
(def res_mul (* 10 3))
(def res_div (float (/ 10 3)))
(println (str "res_add = " res_add))
(println (str "res_sub = " res_sub))
(println (str "res_mul = " res_mul))
(println (str "res_div = " res_div))


(defn print_props [id, name, age, wage, active]
  (println (str "id = " id))
  (println (str "name = " name))
  (println (str "age = " age))
  (println (str "wage = " wage))
  (println (str "active = " active))
  )

(print_props 1 "foo" 10 100.0 true)


(def $id 1)
(def $name "foo")
(def $age  10)
(def $wage 100.0)
(def $active false)
(println (str "class id = " (class $id)))
(println  (str "class name = " (class $name)))
(println (str "class age = " (class $age)))
(println (str "class wage = " (class $wage)))
(println (str "class active = " (class $active)))



(defn testArithmeticOps [x, y]
  (def res_add (+ x y))
  (def res_sub (- x y))
  (def res_mul (* x y))
  (def res_div (float (/ x y)))
  (println (str x " + " y " = " res_add))
  (println (str x " - " y " = " res_sub))
  (println (str x " * " y " = " res_mul))
  (println (str x " / " y " = " res_div))
  )

(testArithmeticOps 10.0 3.0)


(import java.util.ArrayList)
(import java.util.HashMap)
(import java.util.Random)

(defn ArrayExample []
  ; ArrayList Example
  (let [list (ArrayList.)]
    (.add list "foo")
    (.add list "bar")

    (println (.toString list))
    (println (.get list 0))
    )


  ; HashMap Example
  (let [map (HashMap.)]
    (.put map "foo" 10)
    (.put map "bar" 20)
    (.put map "bim" 30)

    (println (.toString map))
    (println (str "foo => " (.get map "foo")))
    (println (str "bar => " (.get map "bar")))
    (println (str "bim => " (.get map "bim")))
    )


  ; Random Example
  (let [random (Random.)]
    (def n1 (.nextInt random))
    (def n2 (.nextInt random))
    (def n3 (.nextDouble random))
    (def n4 (.nextBoolean random))

    (println (str "n1 = " n1))
    (println (str "n2 = " n2))
    (println (str "n3 = " n3))
    (println (str "n4 = " n4))
    )

)


(ArrayExample)

(import javax.swing.JLabel)
(import javax.swing.JButton)
(import javax.swing.JTextField)
(import java.awt.GridLayout)
(import javax.swing.JFrame)
(import java.awt.Dimension)
(import java.awt.Point)
(import javax.swing.JPanel)
(import javax.swing.WindowConstants)
(import java.awt.event.ActionListener)


(defn swingExample []
   (def lblEmpty (JLabel.))
  (def lblTitle (new JLabel)
    )
  (.setText lblTitle "Simple Form Example")


  (def lblId (new JLabel "Id: "))
  (def fieldId (new JTextField))


  (def lblName (new JLabel "Name: "))
  (def fieldName (new JTextField))

  (def lblAge (new JLabel "Age: "))
  (def fieldAge (new JTextField))

  (def lblWage (new JLabel "Wage: "))
  (def fieldWage (new JTextField))

  (def lblActive (new JLabel "Active: "))
  (def fieldActive (new JTextField))

  (def btnOk (new JButton "Ok"))
  (def btnClear (new JButton "Clear"))




  (def mainPanel (JPanel.))
  (.setLayout mainPanel (new GridLayout 7 2 5 5))
  (.add mainPanel lblEmpty)
  (.add mainPanel lblTitle)
  (.add mainPanel lblId)
  (.add mainPanel fieldId)
  (.add mainPanel lblName)
  (.add mainPanel fieldName)
  (.add mainPanel lblAge)
  (.add mainPanel fieldAge)
  (.add mainPanel lblWage)
  (.add mainPanel fieldWage)
  (.add mainPanel lblActive)
  (.add mainPanel fieldActive)
  (.add mainPanel btnOk)
  (.add mainPanel btnClear)


  ;(def act (proxy [ActionListener] []
  ;           (actionPerformed [event] (say-hello))))


  (def onBtnOkClicked (proxy [ActionListener] []
       (actionPerformed [event]
         (def $idRaw (.getText fieldId))
         (def $nameRaw (.getText fieldName))
         (def $ageRaw (.getText fieldAge))
         (def $wageRaw (.getText fieldWage))
         (def $activeRaw (.getText fieldActive))

         (try
           (
             (def $id (Long/parseLong $idRaw))
             (def $name (String/valueOf $nameRaw))
             (def $age (Integer/parseInt $ageRaw))
             (def $wage (Double/parseDouble $wageRaw))
             (def $active (Boolean/parseBoolean $activeRaw))
             (println (str "id = " $id))
             (println (str "name = " $name))
             (println (str "age = " $age))
             (println (str "wage = " $wage))
             (println (str "active = " $active))
             (def msg (str "id = " $id "\nname = " $name "\nage = " $age "\nwage = " $wage
                           "\nactive = " $active))
             (def title "<<Information>>")
             (JOptionPane/showMessageDialog nil msg title JOptionPane/INFORMATION_MESSAGE))
           (catch Exception e (
                (def msg (str "Caught exception: " (.getMessage e)))
                (def title "<<Error>>")
                (JOptionPane/showMessageDialog nil msg title JOptionPane/ERROR_MESSAGE )
                                ))
           )
)
       ))


  (def onBtnClearClicked (proxy [ActionListener] []
     (actionPerformed [event]
       (.setText fieldId "")
       (.setText fieldName "")
       (.setText fieldAge "")
       (.setText fieldWage "")
       (.setText fieldActive "")
       )
    ))
  

  (.addActionListener btnOk onBtnOkClicked)
  (.addActionListener btnClear onBtnClearClicked)


  (def mainFrame (new JFrame))
  (.setTitle mainFrame "Simple Form")
  (.setSize mainFrame (new Dimension 500 500))
  (.setLocation mainFrame (new Point 10 10))
  (.setDefaultCloseOperation mainFrame WindowConstants/EXIT_ON_CLOSE)
  (.add mainFrame mainPanel)
  (.setVisible mainFrame true))

(swingExample)


(try
  (/ 1 0)
  (catch Exception e (println (str "Caught exception " (.getMessage e))))
  )



