import Movie from "./Movie"

const MovieList = ( {movies} ) => {
    return(
        <div className="movieList">
            {movies.map(movie => (
                <Movie 
                key={ movie.id }
                name={ movie.name }
                length={ movie.length }
                genre={ movie.genre }
                />
            ))}
        </div>
    )
}

export default MovieList