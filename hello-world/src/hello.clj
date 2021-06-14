(ns hello
  (:require [java-time :as jt]))

(defn time-str
  "Returns a string representation of a date-time in the local time zone."
  [instant]
  (jt/format
    (jt/with-zone (jt/formatter "hh:mm a") (jt/zone-id))
    instant))

(defn run [opts]
  (println "Hello Time World! The time is" (time-str (jt/instant))))
