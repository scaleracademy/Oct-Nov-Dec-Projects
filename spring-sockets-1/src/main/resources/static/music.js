let btn1 = document.getElementById('btn1')
let btn2 = document.getElementById('btn2')
let btn3 = document.getElementById('btn3')
let btn4 = document.getElementById('btn4')

let aud1 = () => document.getElementById('aud1')
let aud2 = () => document.getElementById('aud2')
let aud3 = () => document.getElementById('aud3')
let aud4 = () => document.getElementById('aud4')

btn1.onclick = function () {
    aud1().play()
}
btn2.onclick = function () {
    aud2().play()
}
btn3.onclick = function () {
    aud3().play()
}
btn4.onclick = function () {
    aud4().play()
}