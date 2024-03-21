import "../App.css"
import MovieList from "../components/MovieList"

import { useState, useEffect } from "react"

const Home = () => {
    const [movies, setMovies] = useState([])

    useEffect(() => {
        const response = async () => await fetch("http://localhost:8080/api/movies")
        .then(data => data.json())
        .then(data => setMovies(data))

        response()
    }, []);


    return(
        <div className="home">
            <h1>Proovige ühte neist filmidest!</h1>
            <MovieList movies={movies.slice(0, 3)} />
        </div>
    )
}

export default Home