using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KacaMata
{
    class Karyawan:OutLet
    {
        public int id { get; set; }

        public string jabatan { get; set; }
        public string Nama {
            get
            {
                return Nama;
            }
            set
            {
                Nama = value;
            }
        }
    }
}
