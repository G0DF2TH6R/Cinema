import { Outlet, Link } from "react-router-dom";
import "../App.css"

const Layout = () => {
    return (
        <>
            <nav className="navbar">
                <Link className="link" to="/home">Kodu</Link>
                <Link className="link" to="/movies">Filmid</Link>
                <Link className="link" to="/screenings">Kinokava</Link>
                <a href="https://www.linkedin.com/in/chris-matsiselts-04b881257/" className="logo">Chris <br/> Movies</a>
            </nav>

            <Outlet />
        </>
    )
};

export default Layout;