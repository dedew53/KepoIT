using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KacaMata
{
    class Barang:Gudang
    {
        public int id_Barang { get; set; }
        public string Deskripsi { get; set; }
        public int harga { get; set; }
        public int jumlah { get; set; }
    }
}
