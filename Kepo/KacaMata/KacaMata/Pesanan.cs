using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KacaMata
{
    class Pesanan:Pasien
    {
        Pesanan pesanan;
        public int id_pemesanan { get; set; }
        public int id_pasien { get; set; }
        public string Nama { get; set; }
        public string Alamat { get; set; }
        public DateTime Tanggal { get; set; }
    }
}
