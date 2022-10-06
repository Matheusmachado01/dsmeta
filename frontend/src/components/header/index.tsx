import logo from '../../assets(recursos)/IMG/logo.svg';
import './styles.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="Spring React Project" />
                <h1>Spring React Project</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.instagram.com/matheus_machado91/">@matheus_machado91</a>
                </p>
            </div>
        </header>

    )
}

export default Header;
