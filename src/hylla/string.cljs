(ns hylla.string)

(defn rand-string 
  ([] (rand-string 10))
  ([n] (rand-string n "abcdefghijklmnoprstuvwxyz"))
  ([n chars]
     (let [char-count (count chars)
           char-vector (vec chars)]
       (apply str (repeatedly n #(char-vector (rand-int char-count)))))))
