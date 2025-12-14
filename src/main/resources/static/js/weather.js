function loadWeather() {
    fetch('/api/weather')
        .then(response => response.json())
        .then(data => {
            document.getElementById('city').innerText = data.city;
            document.getElementById('temperature').innerText =
                data.temperature + "°C";
            document.getElementById('description').innerText =
                data.description;
        })
        .catch(err => {
            console.error(err);
        });
}

// Load automatically on page open
loadWeather();
