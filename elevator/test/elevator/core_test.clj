(ns elevator.core-test
  (:require [midje.sweet :refer :all]
            [elevator.core :refer :all]))

(fact "There should be an elevator that has a starting floor"
	(init-elevator) => 0)

 (fact "Can call elevator to a floor with intended direction"
 	(press-button 2 :down) => (contains 2)
    (press-button 4 :up) => (contains 4))

(fact "can set current floor"
	(change-current-floor :up) => 1
	(change-current-floor :down) => 0)



;(fact "Up should increment the elevator floor by one"
;	(obey-elevator :up {:floor 0}) => {:floor 1}
;)