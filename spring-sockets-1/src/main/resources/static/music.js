;([1, 2, 3, 4]).forEach(id => {
    document.getElementById('btn' + id).onclick = function () {

        client.send(
            '/app/play',
            {},
            JSON.stringify({instrument: 'aud'+id})
        )

    }
})

let sock;
let client;

window.onload = function () {
    sock = new SockJS('/music-mania') // creates a websocket connection
    client = Stomp.over(sock)         // wraps socket into Stomp object

    client.connect({}, function () {
        client.subscribe('/instruments/play', function (data) {
            let body = JSON.parse(data.body)
            document.getElementById(body.instrument).play()
        })
    })
}

