(1..100).each { |i| puts (i%3==0?"Fizz":"") + (i%5==0?"Buzz":"") + ((i%3!=0 && i%5!=0)?(i.to_s):"") }
