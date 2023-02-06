<?php


    class Solution {

    /**
     * @param Integer[] $asteroids
     * @return Integer[]
     */
    function asteroidCollision($asteroids) {
    $stack = [];
    foreach ($asteroids as $asteroid) {
        while (!empty($stack) && end($stack) > 0 && end($stack) < -$asteroid) {
            array_pop($stack);
        }
        if (empty($stack) || $asteroid > 0 || end($stack) < 0) {
            array_push($stack, $asteroid);
        } elseif (end($stack) == -$asteroid) {
            array_pop($stack);
        }
    }
    return $stack;
}

}

?>