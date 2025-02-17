function checkSumEvenOrOdd(number) {
    let sum = 0;
    let temp = number;
    
    while (temp > 0) {
        sum += temp % 10;
        temp = Math.floor(temp / 10);
    }
    
    if (sum % 2 === 0) {
        console.log(`The sum of digits of ${number} is ${sum} and it is Even.`);
    } else {
        console.log(`The sum of digits of ${number} is ${sum} and it is Odd.`);
    }
}

checkSumEvenOrOdd(1234);
