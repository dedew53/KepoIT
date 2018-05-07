using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KacaMata
{
    class Login:Karyawan
    {
        private string username {
            get
            {
                return username;
            }
            set
            {
                username = value;
            }
        }

        private int password {
            get
            {
                return password;
            }
            set
            {
                password = value;
            }

        }
    }
}
